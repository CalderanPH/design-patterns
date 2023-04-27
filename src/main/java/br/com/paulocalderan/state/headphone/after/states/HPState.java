package br.com.paulocalderan.state.headphone.after.states;

import br.com.paulocalderan.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
