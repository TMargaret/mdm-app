import Route from '@ember/routing/route';
import $ from "jquery";

export default class EmployeesViewIndexRoute extends Route {
  async model() {
    return $.getJSON("/devices/" + this.modelFor('employees.view').id).then(data => {
      return data.content;
    });
  }
}
