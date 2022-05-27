import { Component, OnInit } from '@angular/core';
import axios from 'axios';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor() { 
  }

  ngOnInit(): void {
  }

inputValue:any;
  onKey(event) 
  {
    this.inputValue = event.target.value;
  }

  user: any;
  fetchUser(): void{
    axios.get(`http://localhost:8999/user/${this.inputValue}`)
    .then((response) => {
     this.user = response.data
    }).catch(function (error) {}) 
  }
}
