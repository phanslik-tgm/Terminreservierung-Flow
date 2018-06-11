/**
 *
 */
package com.sew.ui.crud;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sew.backend.data.entity.Order;
import com.sew.backend.data.entity.Product;
import com.sew.backend.data.entity.User;
import com.sew.backend.service.OrderService;
import com.sew.backend.service.ProductService;
import com.sew.backend.service.UserService;
import com.sew.ui.views.storefront.StorefrontView;

@Configuration
public class PresenterFactory {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CrudEntityPresenter<Product> productPresenter(ProductService crudService, User currentUser) {
		return new CrudEntityPresenter<>(crudService, currentUser);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CrudEntityPresenter<User> userPresenter(UserService crudService, User currentUser) {
		return new CrudEntityPresenter<>(crudService, currentUser);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public EntityPresenter<Order, StorefrontView> orderEntityPresenter(OrderService crudService, User currentUser) {
		return new EntityPresenter<>(crudService, currentUser);
	}

}
