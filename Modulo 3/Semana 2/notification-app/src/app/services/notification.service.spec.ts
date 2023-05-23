import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { NOTIFICATIONS_MOCK } from '../utils/notifications-mock';

import { NotificationService } from "src/app/services/notification.service";
import { HttpClient } from '@angular/common/http';

describe('NotificationService', () => {
    let httpTestingController: HttpTestingController;
    let notificationService: NotificationService;
    let httpClient: HttpClient;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [HttpClientTestingModule],
            providers: [NotificationService]
        })
            .compileComponents();

        // recupera a instância do controle de teste
        httpTestingController = TestBed.inject(HttpTestingController);
        httpClient = TestBed.inject(HttpClient);

        // recupera NotificationService já configurada com sua dependência (HttpClient)   
        notificationService = TestBed.inject(NotificationService);
    });

    it('Should create service', () => { expect(notificationService).toBeTruthy(); });

    describe('getNotifications', () => {
        it('Should load all NOTIFICATIONS_MOCK', () => {
            //chama método do serviço, faz um subscribe para executar o expect em cada retorno do método
            notificationService.getNotifications().subscribe((data) => {
                expect(data).toEqual(NOTIFICATIONS_MOCK);
            });
        })
        describe('getNotificationsApi', () => {
            it('Should call method with success', () => {
                notificationService.getNotificationsApi().subscribe();

                //gera um request de http
                const req = httpTestingController.expectOne(`${notificationService.BASE_URL}`);
                //verifica tipo de http request
                expect(req.request.method).toEqual('GET');
            })
        })
        describe('addNotificationsApi', () => {
            it('Should call method with success', () => {
                const notificationMock = { message: 'Test notification' };
                //mocka resultado do método do serviço
                notificationService.addNotificationApi(notificationMock).subscribe();

                //gera um request de http
                const req = httpTestingController.expectOne(`${notificationService.BASE_URL}`);

                //verifica tipo de http request
                expect(req.request.method).toEqual('POST');
                //verifica resultado do body do request
                expect(req.request.body).toEqual(notificationMock);
            });
        })
        describe('editNotificationApi', () => {
            it('Should call method with success', () => {
                const notificationMock = { id: 1, message: 'Test notification' };
                notificationService.editNotificationApi(notificationMock).subscribe();

                //gera um request de http
                const req = httpTestingController.expectOne(`${notificationService.BASE_URL}/${notificationMock.id}`);
                
                expect(req.request.method).toEqual('PUT');
                expect(req.request.body).toEqual(notificationMock);
            });
        })
        describe('removeNotification', () => {
            it('Should call method with success', () => {
                const notificationMock = { id: 1, message: 'Test notification' };
                notificationService.removeNotification(notificationMock.id).subscribe();

                const req = httpTestingController.expectOne(`${notificationService.BASE_URL}/${notificationMock.id}`);
                expect(req.request.method).toEqual('DELETE');
            });
        })
    })
});