import Controller from '@ember/controller';
import $ from "jquery";
import { action } from '@ember/object';

export default class EmployeesViewEditController extends Controller {

  @action
  saveDevice(device) {
    $.ajax({
      type: 'POST',
      url: "/devices/device",
      data: JSON.stringify(device),
      contentType: "application/json",
      dataType: "json",
    }).then(() => {
      this.transitionToRoute('employees.view')
    })
  }
}
