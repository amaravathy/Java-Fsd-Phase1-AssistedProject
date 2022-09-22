import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{"name":"Amaravathy","email":"amar@gmail.com"},
  {"name":"Jeni","email":"jeni@gmail.com"},
  {"name":"Chandru","email":"chandru@gmail.com"},
  {"name":"Soniya","email":"soniya@gmail.com"},
  {"name":"moni","email":"moni@gmail.com"},
  {"name":"Ram","email":"ram@gmail.com"},
  {"name":"mani","email":"mani@gmail.com"},
  {"name":"Akash","email":"akash@gmail.com"},
]

flag=false;

show(){
  this.flag=!this.flag;
}

public day= new Date().getDay();
}
