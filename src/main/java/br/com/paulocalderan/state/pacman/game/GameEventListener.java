package br.com.paulocalderan.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
