package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;

public class SignOutService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		
		HttpSession session = request.getSession();
		session.invalidate();
		forward.setRedirect(false);
		forward.setPath("Main.jsp");
		
		return forward;
	}

}
