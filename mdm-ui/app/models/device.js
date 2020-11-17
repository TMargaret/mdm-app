import Model from '@ember-data/model';

export default class DeviceModel extends Model {

  @attr('string') id;
  @attr('string') name;
  @attr('string') serialNumber;
  @attr('string') type;
}
