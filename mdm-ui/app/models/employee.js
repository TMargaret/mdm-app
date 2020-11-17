import Model, {attr} from '@ember-data/model';

export default class EmployeeModel extends Model {

  @attr('string') id;
  @attr('string') name;
  @attr('email') email;
  @hasMany('device') devices;

}
