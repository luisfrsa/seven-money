import { Injectable, Inject } from '@angular/core';
// import 'rxjs/add/operator/map';
// import 'rxjs/add/operator/catch';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class UserService {
  urlUsers: string = 'http://localhost:8080/api/users';
  urlLocations: string = 'http://localhost:8080/api/locations';
  urlPunches: string = 'http://localhost:8080/api/timePunches';
  jsonUsers: string = 'https://shiftstestapi.firebaseio.com/users.json';
  jsonLocations: string = 'https://shiftstestapi.firebaseio.com/locations.json';
  jsonPunches: string = 'https://shiftstestapi.firebaseio.com/timePunches.json';

  //I know I should split it in files, but I costs much time...
  constructor(@Inject(HttpClient) public httpClient: HttpClient) {
  }
  
  getAllJsonUsers() {
    return this
    .httpClient.get(this.jsonUsers)
    .toPromise();
  }
  
  getAllJsonLocations(){
    return this
    .httpClient.get(this.jsonLocations)
    .toPromise();
  }
  
  getAllJsonTimePunches() {
    return this
    .httpClient.get(this.jsonPunches)
    .toPromise();
  }
  
  postUserToServer(users){
    return this.httpClient.post(this.urlUsers, users).toPromise();
  }
  
  postLocationToServer(locations){
    return this.httpClient.post(this.urlLocations, locations).toPromise();
  }
  
  postTimePunches(timePunches) {
    console.log(timePunches);
    return this.httpClient.post(this.urlPunches, timePunches).toPromise();
  }
  

  
}
