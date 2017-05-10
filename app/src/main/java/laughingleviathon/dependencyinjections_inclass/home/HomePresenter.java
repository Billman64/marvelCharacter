package laughingleviathon.dependencyinjections_inclass.home;

import java.util.ArrayList;
import java.util.List;

import laughingleviathon.dependencyinjections_inclass.data.Character;

/**
 * Created by User on 5/10/2017.
 */

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View mView;

    HomePresenter(HomeContract.View view){
        this.mView = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void searchCharacter(String character) {
        List<Character> results = new ArrayList<>(0);
        // TODO - Bill search logic
        mView.showResults(results);

    }
}
