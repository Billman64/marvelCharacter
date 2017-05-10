package laughingleviathon.dependencyinjections_inclass.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import laughingleviathon.dependencyinjections_inclass.R;
import laughingleviathon.dependencyinjections_inclass.data.Character;
import laughingleviathon.dependencyinjections_inclass.home.HomeContract;
import laughingleviathon.dependencyinjections_inclass.home.HomePresenter;

public class MainActivity extends AppCompatActivity implements HomeContract.View {

//    private HomePresenter mPresenter;  // causes error in setPresent()
    private HomeContract.Presenter mPresenter;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSeardch(HomeContract.View view) {
        mPresenter.searchCharacter("Thor");
    }

    @Override
    public void setPresent(HomeContract.Presenter presenter) {
        mPresenter = presenter;

    }

    @Override
    public void showResults(List<Character> results) {
        // TODO Display results in RecyclerView
    }
}
