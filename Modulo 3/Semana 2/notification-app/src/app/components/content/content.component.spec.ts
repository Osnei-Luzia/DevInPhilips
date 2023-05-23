import { TestBed } from '@angular/core/testing';

import { AppModule } from "src/app/app.module";
import { ContentComponent } from "./content.component";

beforeEach(async () => {
    await TestBed.configureTestingModule({
        imports: [AppModule],
        declarations: [ContentComponent],
    })
        .compileComponents();

});

describe('submit', () => {
    it('Should create component', () => { expect(ContentComponent).toBeTruthy(); });
});
