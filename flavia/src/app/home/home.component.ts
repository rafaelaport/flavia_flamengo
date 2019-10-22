import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  textoBuscado: string;
  ehIgual: boolean;


  constructor() { }

  ngOnInit() {
  }

  actionMethod() {
    console.log("actionMethod was called!");
  }

  myFunction() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
  }

  myFunction2() {
    var popup = document.getElementById("myPopup2");
    popup.classList.toggle("show");
  }

  myFunction3() {
    var popup = document.getElementById("myPopup3");
    popup.classList.toggle("show");
  }

  myFunction4() {
    var popup = document.getElementById("myPopup4");
    popup.classList.toggle("show");
  }

  myFunction5() {
    var popup = document.getElementById("myPopup5");
    popup.classList.toggle("show");
  }

  myFunction6() {
    var popup = document.getElementById("myPopup6");
    popup.classList.toggle("show");
  }

  buscar() {
    if(this.textoBuscado == "Vôlei"){
      this.ehIgual = true;
    } else {
      this.ehIgual = false;
    }
  }
}
