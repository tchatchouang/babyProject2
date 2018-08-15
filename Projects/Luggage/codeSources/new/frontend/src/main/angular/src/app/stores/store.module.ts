import {DevToolsExtension, NgRedux, NgReduxModule} from '@angular-redux/store';
import {NgModule} from '@angular/core';
import {createLogger} from 'redux-logger';
import {LoginActions} from './actions/login/login.actions';
import {NgReduxFormModule} from '@angular-redux/form';
import {IAppState, rootReducer} from './reducers/reducers';
import {BrowserModule} from '@angular/platform-browser';
import {SignOutActions} from './actions/signOut/sign-out-actions';
import {combineEpics, createEpicMiddleware} from 'redux-observable';
import {LoginEpics} from './epics/login/login-epics';
import {SignOutEpics} from './epics/signOut/sign-out-epics';
import {SignUpActions} from './actions/singUp/sign-up-actions';
import {ProposerTrajetActions} from './actions/proposerTrajet/proposer-trajet-actions';
import {ProposerTrajetEpics} from './epics/proposerTrajet/proposer-trajet-epics';
import {TrajetPublierActions} from './actions/trajetPublier/trajet-publier-actions';
import {MessagerieActions} from './actions/messagerie/messagerie.actions';
import {HomeActions} from './actions/home/home-actions';
import {HomeEpics} from './epics/home/home-epics';

@NgModule({
  imports: [
    BrowserModule,
    NgReduxModule,
    NgReduxFormModule,
  ],
  providers: [
    LoginActions,
    SignOutActions,
    SignUpActions,
    ProposerTrajetActions,
    TrajetPublierActions,
    MessagerieActions,
    HomeActions,
    LoginEpics,
    SignOutEpics,
    ProposerTrajetEpics,
    HomeEpics,
  ],
})
export class StoreModule {
  constructor(public ngRedux: NgRedux<IAppState>, devTools: DevToolsExtension, private loginEpic: LoginEpics,
              private  signOutEpics: SignOutEpics, private proposerTrajetEpic: ProposerTrajetEpics, private homeEpics: HomeEpics) {
    const rootEpic = combineEpics(
      this.proposerTrajetEpic.proposerTrajaetEpic,
      this.homeEpics.fetchPersonEpic,
    );

    const storeEnhancers = devTools.isEnabled() ?
      [devTools.enhancer()] :
      [];
    const middlewares = [
      createLogger(),
      createEpicMiddleware(rootEpic),

    ];

    this.ngRedux.configureStore(rootReducer, {}, middlewares, storeEnhancers);

    // Enable syncing of Angular form state with our Redux store.
    // provideReduxForms(ngRedux);
  }
}
