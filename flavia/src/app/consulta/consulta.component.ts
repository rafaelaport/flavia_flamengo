import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-consulta',
  templateUrl: './consulta.component.html',
  styleUrls: ['./consulta.component.css']
})
export class ConsultaComponent implements OnInit {
  
  textoBuscado: string;
  ehIgual: boolean;

  constructor() { }

  ngOnInit() {
  }
  
  buscar() {
    if(this.textoBuscado == "Vôlei"){
      this.ehIgual = true;
    } else {
      this.ehIgual = false;
    }
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

}
