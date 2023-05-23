import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppModule } from "src/app/app.module";
import { ContentComponent } from "./content.component";
import { of } from 'rxjs';
import { NotificationService } from 'src/app/services/notification.service';

describe('ContentComponent', () => {

    //mock do component
    let fixture: ComponentFixture<ContentComponent>;
    //apelido para o mock do componente
    let component: ContentComponent;
    //mock para serviço
    let notificationService = jasmine.createSpyObj(NotificationService, ['editNotificationApi', 'getNotifications', 'removeNotification']);

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [AppModule],
            declarations: [ContentComponent],
            providers: [{ provide: NotificationService, useValue: notificationService }]
        })
            .compileComponents();
        fixture = TestBed.createComponent(ContentComponent);
        component = fixture.componentInstance;
    });

    it('Should create component', () => { expect(ContentComponent).toBeTruthy(); });

    //describe de novo teste
    describe('ngOnInit', () => {

        //teste unitario
        it('Should call carregarNotificacoes method with success', () => {

            //observa o método
            spyOn(component, 'carregarNotificacoes');
            component.ngOnInit();
            expect(component.carregarNotificacoes).toHaveBeenCalled();
        })
    })
    describe('AtualizarLista', () => {
        it('lerNotificacao - Should call atualizarLista method with success', () => {
            spyOn(component, 'carregarNotificacoes');

            //chamado de métodos do componente
            component.atualizarLista();

            expect(component.carregarNotificacoes).toHaveBeenCalled();
        })
    })
})