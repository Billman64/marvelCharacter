package laughingleviathon.dependencyinjections_inclass.home;

import java.util.List;

import laughingleviathon.dependencyinjections_inclass.BasePresenter;
import laughingleviathon.dependencyinjections_inclass.BaseView;
import laughingleviathon.dependencyinjections_inclass.data.Character;

/**
 * This is the specific contract between the view and the presenter.
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {
        void showResults(List<Character> results);
    }

    interface  Presenter extends BasePresenter {
        void searchCharacter(String character);
    }
}
