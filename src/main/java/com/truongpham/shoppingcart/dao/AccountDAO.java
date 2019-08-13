package com.truongpham.shoppingcart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.truongpham.shoppingcart.entity.Account;

@Transactional
@Repository
public class AccountDAO {

  @Autowired
  private SessionFactory sessionFactory;

  public Account findAccount(String userName) {
    Session session = this.sessionFactory.getCurrentSession();
    return session.find(Account.class, userName);
  }
  
  public void creatNewAccount(Account account) {
	  Session session = this.sessionFactory.getCurrentSession();
	  session.persist(account);
  }

}
