import Controller from '@ember/controller';
import {action} from '@ember/object';
import {tracked} from "@glimmer/tracking";
import { inject as service } from '@ember/service';

export default class EmployeesController extends Controller {
  @tracked company;
  @service router;

  @action
  selectCompany(event) {
    this.company = event.target.value;
  }

  get activeRoute() {
    return this.get('router').get('currentRouteName') === "employees.index";
  }

  get getParam(){
    const urlParams = new URLSearchParams(window.location.search);
    this.company = urlParams.get('company');
  }


}
