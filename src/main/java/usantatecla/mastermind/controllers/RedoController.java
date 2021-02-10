package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends Controller {
    
    RedoController(Session session) {
        super(session);
      }
    
      void redo() {
        this.session.redo();
      }
    
      boolean redoable() {
        return this.session.redoable();
      }

      @Override
      public void accept(ControllersVisitor controllersVisitor) {
          // TODO Auto-generated method stub

      }
}
