import { Component, OnInit } from '@angular/core';
import { NOTIFICACOES } from 'src/app/mocks/mocks';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'noteApp-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit {
  title = 'Projeto';
  notificacoes = NOTIFICACOES
  ler(args: any) {
    if (args.lido) {
      args.lido = false
    } else {
      args.lido = true
    }
  }
  public constructor(private route: ActivatedRoute, private router: Router) {
  }
  ngOnInit(): void {
    const rota = this.route.snapshot.data['status']
    console.log(rota)
    if (rota == "lidos") {
      this.notificacoes = this.notificacoes.filter(notificacao => notificacao.lido)
      console.log(this.notificacoes)
    }
    if (rota == "naolidos") {
      this.notificacoes = this.notificacoes.filter(notificacao => !notificacao.lido)
      console.log(this.notificacoes)
    }
  }
}