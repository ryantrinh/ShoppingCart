import com.devsfast.cart.Item;
import com.devsfast.cart.ShoppingCart;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShoppingCartTest {

    @Test
    void totalOfEmptyCart() {
        ShoppingCart shoppingCart = buildShoppingCartWithItems();
        assertThat(shoppingCart.getTotal()).isEqualTo(0.0);

    }

    @Test
    void totalOfSingleItem() {
        ShoppingCart shoppingCart = buildShoppingCartWithItems(new Item(100.0, 1));
        assertThat(shoppingCart.getTotal()).isEqualTo(100.0);
    }

    @NotNull
    private ShoppingCart buildShoppingCartWithItems(Item...items) {
        return new ShoppingCart(Arrays.asList(items));
    }

    @Test
    void totalOfDoubleItems() {
        ShoppingCart shoppingCart = buildShoppingCartWithItems(
                new Item(100, 1),
                new Item(200, 1));
        assertThat(shoppingCart.getTotal()).isEqualTo(300.0);
    }

    @Test
    void totalOfItemsWithQuantityTwo() {
        ShoppingCart shoppingCart = buildShoppingCartWithItems(
                new Item(100, 2),
                new Item(200, 1)
        );
        assertThat(shoppingCart.getTotal()).isEqualTo(400.0);
    }
}
