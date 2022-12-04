import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ControladorEnviosService {
  setData(data: any) {
    const jsonData = JSON.stringify(data)
    localStorage.setItem("myData", jsonData)
  }
  getData() {
    return localStorage.getItem("myData")
  }
  removeData(key : any) {
    localStorage.removeItem(key)
  }
  constructor() {
    this.setData
    this.getData
    // this.removeData
  }
}
