import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getUser(){
    return {"fname":"Amar","lname":"P"};
  }
}
