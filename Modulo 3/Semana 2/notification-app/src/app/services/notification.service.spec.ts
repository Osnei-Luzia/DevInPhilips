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
});