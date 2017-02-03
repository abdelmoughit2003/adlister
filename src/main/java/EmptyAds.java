import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdelmoughit on 2/2/2017.
 */
public class EmptyAds implements Ads {
    @Override
    public List<Ad> all() {
        return new ArrayList<>();
    }

    @Override
    public void insert(Ad ad) {
    }

    @Override
    public Ad find(long id) {
        return null;
    }
}