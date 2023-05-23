import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppModule } from "src/app/app.module";
import { ContentComponent } from "./content.component";

describe('ContentComponent', () => {

    //mock do component
    let fixture: ComponentFixture<ContentComponent>;
    //apelido para o mock do componente
    let component: ContentComponent;

    beforeEach(async () => {
        await TestBed.configureTestingModule({
            imports: [AppModule],
            declarations: [ContentComponent],
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
            spyOn(component, 'carregarNotificacoes');
            component.ngOnInit();
            expect(component.carregarNotificacoes).toHaveBeenCalled();
        })
    })
})