import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from "rxjs";

import { AppModule } from "src/app/app.module";
import { NotificationService } from "src/app/services/notification.service";
import { NotificationAddComponent } from './notification-add.component';

describe('ContentComponent', () => {
    let fixture: ComponentFixture<NotificationAddComponent>;
    let component: NotificationAddComponent;
    let notificationService = jasmine.createSpyObj(NotificationService, ['addNotificationApi']);

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [AppModule],
            declarations: [NotificationAddComponent],
            providers: [{ provide: NotificationService, useValue: notificationService }]
        })
            .compileComponents();
        fixture = TestBed.createComponent(NotificationAddComponent);
        component = fixture.componentInstance;

    });

    it('Should create component', () => {
        expect(component).toBeTruthy();
    });

    describe('enviarForm', () => {
        it('Should call notificacaoCadastrada event with success', () => {
            spyOn(component.notificacaoCadastrada, 'emit');

            const novaNotificacao = {
                titulo: '',
                descricao: '',
                aplicativo: 'IFOOD',
                tempoPublicacao: 'Agora',
                imagem: 'assets/images/ifood.png',
                lido: false
            }

            notificationService.addNotificationApi.and.returnValue(of({ novaNotificacao }));
            component.enviarForm();

            expect(notificationService.addNotificationApi).toHaveBeenCalledWith(novaNotificacao);
            expect(component.notificacaoCadastrada.emit).toHaveBeenCalled();
        });
    })
});
