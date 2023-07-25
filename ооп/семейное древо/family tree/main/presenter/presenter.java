package presenter;

import ui.View;
import family_api.Service;
import family_api.FamilyService;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new FamilyService();
    }

    public void getInfo(String name) {
        String answer = service.get(name);
        view.print(answer);
    }
}