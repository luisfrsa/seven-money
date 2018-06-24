import { Component, OnInit } from '@angular/core';
import { UserService } from './user.component.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  
  user_status: boolean = false;
  location_status: boolean = false;
  timePunches_status: boolean = false;
  
  constructor( private service: UserService) { }
  
  ngOnInit() {
    this.service
    .getAllJsonUsers()
    .then(response =>this.handleUsers(response));
    
    this.service
    .getAllJsonLocations()
    .then(response => this.handleLocations(response));
    
    this.service
    .getAllJsonTimePunches()
    .then(response => this.handleTimePunches(response));
  }
  
  handleUsers(response){
    let users = [];
    for (let i in response){
      for (let j in response[i]){
        users.push(response[i][j]);
      }
    }
    this.service.postUserToServer(users)
    .then(()=>{this.user_status=true;});
  }
  
  handleLocations(response) {
    let locations = [];
    for (let i in response) {
      locations.push(response[i]);
    }
    this.service.postLocationToServer(locations)
    .then(()=>{this.location_status=true;});
  }
  
  handleTimePunches(response) {
    let timePunches = [];
    for (let i in response) {
      timePunches.push(response[i]);
    }
    let fixedTime = this.fixTimePunchesDates(timePunches);
    this.service.postTimePunches(fixedTime)
    .then(()=>{this.timePunches_status=true;});
  }

  fixTimePunchesDates(array) {
    return array.map(elem => {
      elem.clockedIn = this.fixDates(elem.clockedIn);
      elem.clockedOut = this.fixDates(elem.clockedOut);
      elem.created = this.fixDates(elem.created);
      elem.modified = this.fixDates(elem.modified);
      return elem;
    });
  }
  
  fixDates(date) {
    let timestamp = Date.parse(date);
    return (isNaN(timestamp) === false) ? date : null;
  }
}
