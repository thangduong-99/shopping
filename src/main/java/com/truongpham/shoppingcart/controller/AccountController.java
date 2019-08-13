package com.truongpham.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.truongpham.shoppingcart.dao.AccountDAO;
import com.truongpham.shoppingcart.entity.Account;
import com.truongpham.shoppingcart.form.AccountForm;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountDAO accountDAO;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp(Model model) {
		AccountForm accountForm = new AccountForm();
		model.addAttribute("accountForm", accountForm);
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("accountForm") AccountForm accountForm, Model model) {
		String userName = accountForm.getUserName();
		String encrytedPassword = this.passwordEncoder.encode(accountForm.getEncrytedPassword());
		boolean active = true;
		String userRole = "ROLE_EMPLOYEE";
			Account account = new Account();
			account.setUserName(userName);
			account.setEncrytedPassword(encrytedPassword);
			account.setActive(active);
			account.setUserRole(userRole);
			accountDAO.creatNewAccount(account);
			return "_menu";
		
	}
}
