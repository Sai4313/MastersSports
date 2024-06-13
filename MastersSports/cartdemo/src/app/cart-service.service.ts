import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CartServiceService {

  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  getCartItems(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  addToCart(product: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/add`, product);
  }

  removeFromCart(productId: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/remove/${productId}`);
  }

  clearCart(): Observable<any> {
    return this.http.delete(`${this.baseUrl}/clear`);
  }
}
