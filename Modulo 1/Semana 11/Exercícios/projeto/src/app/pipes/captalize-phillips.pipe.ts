import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'captalizePhillips'
})
export class CaptalizePhillipsPipe implements PipeTransform {

  transform(value: any, ...args: unknown[]): any {
    value = value.split(" ");
    for (let cont = 0; cont < value.length; cont++) {
      value[cont] = value[cont][0].toUpperCase() + value[cont].substr(1);
    }
    return value.join(" ");
  }

}
