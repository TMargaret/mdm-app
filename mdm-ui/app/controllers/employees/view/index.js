import Controller from '@ember/controller';
import $ from "jquery";
import { action } from '@ember/object';

export default class EmployeesViewIndexController extends Controller {

  columns = [
    { name: 'Id', valuePath: 'id' },
    { name: 'Name', valuePath: 'name' },
    { name: 'Serial Number', valuePath: 'serialNumber' },
    { name: 'Type', valuePath: 'type'},
    { name: '', valuePath: 'edit'},
    { name: '', valuePath: 'delete'},
  ];

  sorts = [
    {
      valuePath: 'Name',
      isAscending: false,
    },
    {
      valuePath: 'Serial Number',
      isAscending: true,
    },
  ]

  @action
  deleteDevice(deviceId) {
    $.ajax({
      url: '/devices/' + deviceId,
      type: 'DELETE',
      success: function() {
        window.location.reload();
      },
      error: function(response) {
        console.log(response)
      }
    });
  }

  @action
  addNewDevice() {
    this.transitionToRoute('employees.view.add');
  }
}
