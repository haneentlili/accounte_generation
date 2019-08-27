import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CompteService } from 'src/app/services/compte.service';

@Component({
  selector: 'app-getcompte',
  templateUrl: './getcompte.component.html',
  styleUrls: ['./getcompte.component.css']
})
export class GetcompteComponent implements OnInit {
  id:string;
  compte:any;

  constructor(private route :ActivatedRoute,private compteService:CompteService) { }

  ngOnInit() {
    this.id = this.route.snapshot.paramMap.get('id')
  
    this.compteService.getcompte(this.id).subscribe(
      data=>{
        this.compte=data;
        console.log(this.compte);
      },
      error=>console.error(error)
  )
  
  };
    

}
