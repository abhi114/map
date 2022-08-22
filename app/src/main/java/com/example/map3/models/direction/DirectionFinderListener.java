package com.example.map3.models.direction;

import java.util.List;

public interface DirectionFinderListener {
    void onDirectionFinderStart();

    void onDirectionFinderSuccess(List<Route> route);
}
