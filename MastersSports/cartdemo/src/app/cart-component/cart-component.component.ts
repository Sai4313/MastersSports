import { Component, OnInit } from '@angular/core';
import { CartServiceService } from '../cart-service.service';

@Component({
  selector: 'app-cart-component',
  templateUrl: './cart-component.component.html',
  styleUrls: ['./cart-component.component.css']
})
export class CartComponentComponent implements OnInit {
  cartItems: any[] = [];

  constructor(private cartService: CartServiceService) { }

  ngOnInit(): void {
    this.getCartItems();
  }

  getCartItems() {
    this.cartService.getCartItems().subscribe(data => {
      this.cartItems = data;
    });
  }

  addToCart(product: any) {
    this.cartService.addToCart(product).subscribe(() => {
      this.getCartItems();
    });
  }

  removeFromCart(productId: number) {
    this.cartService.removeFromCart(productId).subscribe(() => {
      this.getCartItems();
    });
  }

  clearCart() {
    this.cartService.clearCart().subscribe(() => {
      this.getCartItems();
    });
  }
}
