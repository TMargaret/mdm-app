import Application from 'mdm-ui/app';
import config from 'mdm-ui/config/environment';
import { setApplication } from '@ember/test-helpers';
import { start } from 'ember-qunit';

setApplication(Application.create(config.APP));

start();
