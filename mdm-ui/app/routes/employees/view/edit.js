import Route from '@ember/routing/route';
import $ from "jquery";

export default class EmployeesViewEditRoute extends Route {
  async model(params) {
    return $.getJSON("/devices/device/" + params.deviceId).then(data => {
      data.employeeId = this.modelFor('employees.view').id
      return data;
    });
  }
}
