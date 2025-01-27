import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  private sharedData = new BehaviorSubject<any>(null);
  data = this.sharedData.asObservable();
  constructor() { }

  setData(sharingData:any){
    this.sharedData.next(sharingData);
  }

  getData(){
    return this.sharedData;
  }
}
