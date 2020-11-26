import Controller from '@ember/controller';
import $ from "jquery";
import { action } from '@ember/object';

export default class EmployeesViewAddController extends Controller {

  @action
  addDevice(employee) {
    let newDevice =  {
      name: this.get('name'),
      serialNumber: this.get('serialNumber'),
      type: this.get('type'),
      employeeId: employee.id
    };
    $.getJSON({
      type: 'POST',
      url: "/devices/device",
      data: JSON.stringify(newDevice),
      contentType: "application/json",
      dataType: "json",
    }).then(() => {
      this.transitionToRoute('employees.view')
    })
  }
}
