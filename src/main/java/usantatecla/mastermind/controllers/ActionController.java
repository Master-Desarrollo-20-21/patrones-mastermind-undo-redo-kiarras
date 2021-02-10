package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;

public class ActionController extends Controller {
    
    public ActionController(Session session){
        super(session);
    }
	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLooser() {
		return this.session.isLooser();
	}
	
	public int getAttempts() {
		return this.session.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.session.getColors(position);
	}

	public int getBlacks(int position) {
		return this.session.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.session.getWhites(position);
	}

	public void next() {
        this.session.next();
	}

	public void addProposedCombination(List<Color> colors) {
        this.session.addProposedCombination(colors);
	}
    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        // TODO Auto-generated method stub

    }
}
