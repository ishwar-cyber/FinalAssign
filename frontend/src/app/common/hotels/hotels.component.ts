import { CommonModule } from '@angular/common';
import { Component, inject, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { HotelsService } from './hotels.service';

export interface Payload {
  payload: response[]
  message: string
}

export interface response {
  id: number
  name: string
  roomPrice: number
  imageUrl: string
  description: string
  rating: number
  city: string
  email: string
  wifi: boolean
  gym: boolean
  pool: boolean
}

@Component({
  selector: 'app-hotels',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './hotels.component.html',
  styleUrl: './hotels.component.scss'
})
export class HotelsComponent implements OnInit{

  filterForm:any= FormGroup;

  public getAllHotel:any = [];
  hotelsService = inject(HotelsService);
  formBuilder = inject(FormBuilder)
  ngOnInit(): void {
    this.filterForm =this.formBuilder.group({
      city: [''],
      minRating:[''],
      maxRating:['']
    });

    this.hotelsService.getHotels().subscribe((res:Payload)=>{
      console.log('hotel',res.payload);
      this.getAllHotel =res.payload
    });

  }

  filterHotel(){
    let city  = this.filterForm.controls.city.value;
    let min = this.filterForm.controls.minRating.value;
    let max = this.filterForm.controls.maxRating.value
    // 
    this.getAllHotel = this.getAllHotel.filter((hotel:any)=>{
      return  hotel.city.toLowerCase() === city || hotel.rating < max
    });
  }

}
