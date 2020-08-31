import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule,HttpClientJsonpModule } from '@angular/common/http';
import { ListItemsComponent } from './list-items/list-items.component';
import { UpdateQualityComponent } from './update-quality/update-quality.component';
import { AddItemComponent } from './add-item/add-item.component';



@NgModule({
  declarations: [
    AppComponent,
    ListItemsComponent,
    UpdateQualityComponent,
    AddItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    HttpClientJsonpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
