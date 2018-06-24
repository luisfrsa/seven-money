import { UserComponent } from "./user.component";
import { TestBed } from '@angular/core/testing';
import { UserService } from './user.component.service';

class MockUserService { }

describe('UserComponent', () => {
  let component: UserComponent;
  
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        UserComponent,
        { provide: UserService, useClass: MockUserService }
      ]
    });
    component = TestBed.get(UserComponent);
  });
  
  it('Should not validade Date time 1', () => {
    let date = component.fixDates("0000-00-00 00:00:00");
    expect(date).toBeNull();
  });
  
  it('Should not validade Date time 2', () => { 
    let date = component.fixDates("9999-99-99 99:99:99");
    expect(date).toBeNull();  
  });
  
  it('Should not validade Date time 3', () => { 
    let strDate = "2018-06-24 10:70:00";
    let date = component.fixDates(strDate);
    expect(date).toBeNull();
  });
  
  it('Should not validade Date time 4', () => { 
    let strDate = "2018-06-24 30:00:00";
    let date = component.fixDates(strDate);
    expect(date).toBeNull();
  });
  
  it('Should not validade Date time 5', () => { 
    let strDate = "2018-50-24 00:00:00";
    let date = component.fixDates(strDate);
    expect(date).toBeNull();
    
  });
  
  it('Should validade Date time 1', () => {
    let strDate = "2018-06-24 00:00:00";
    let date = component.fixDates(strDate);
    expect(date).toBe(strDate);
  });
  
  it('Should validade Date time 2', () => {
    let strDate = "2018-06-24 10:10:10";
    let date = component.fixDates(strDate);
    expect(date).toBe(strDate);
  });
  
  it('It should fix object', () => {
    let obj = [{
      clockedIn: "0000-00-00 00:00:00",
      clockedOut: "0000-00-00 00:00:00",
      created: "0000-00-00 00:00:00",
      modified: "0000-00-00 00:00:00"
    }];
    let objAssert = [{
      clockedIn: null,
      clockedOut: null,
      created: null,
      modified: null
    }];
    let objAfter = component.fixTimePunchesDates(obj);
    objAfter.forEach(after=>{
      for (let i in after){
        expect(after[i]).toBe(objAssert[0][i]);
      }
    });
  });
  it('It should fix object 2', () => {
    let obj = [{
      clockedIn: "2017-06-24 10:10:10",
      clockedOut: "2018-05-24 10:10:10",
      created: "2018-06-24 11:10:10",
      modified: "2018-06-24 10:12:10"
    }];
    let objAssert = [{
      clockedIn: "2017-06-24 10:10:10",
      clockedOut: "2018-05-24 10:10:10",
      created: "2018-06-24 11:10:10",
      modified: "2018-06-24 10:12:10"
    }];
    let objAfter = component.fixTimePunchesDates(obj);
    objAfter.forEach(after => {
      for (let i in after) {
        expect(after[i]).toBe(objAssert[0][i]);
      }
    });
  });
  
});


