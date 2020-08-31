import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-list-items',
  templateUrl: './list-items.component.html',
  styleUrls: ['./list-items.component.css']
})
export class ListItemsComponent implements OnInit {

  url = 'http://localhost:9091/items';

  constructor(private http:HttpClient) { 

    this.http.get(this.url).toPromise().then(data => {
      console.log(data);
      //Show here all items but again Cors Error
    }
    )
  }

  ngOnInit(): void {
  }

}
