import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-quality',
  templateUrl: './update-quality.component.html',
  styleUrls: ['./update-quality.component.css']
})
export class UpdateQualityComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  UpdateItems(){
    //Update here with Spring Boot Rest API
  }

}
