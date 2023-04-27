package net.rudahee.metallics_arts.modules.custom_items.metal_minds.bands;

import net.minecraft.world.item.Item;
import net.rudahee.metallics_arts.data.enums.implementations.MetalTagEnum;
import net.rudahee.metallics_arts.modules.custom_items.metal_minds.BandMindAbstract;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.AbstractFechuchemicHelper;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.hybrid_metals.BendalloyFecuchemicHelper;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.hybrid_metals.CadmiumFecuchemicHelper;

/**
 * Class that specifies the cadmium and bendalloy band, we pass to the abstract class (which has the behavior) the metals that compose it,
 * in the order: metal and its alloy, along with their corresponding suppliers.
 *
 * @author SteelCode Team
 * @since 1.5.1
 *
 * @see BandMindAbstract
 * @see AbstractFechuchemicHelper
 */
public class BandCadmiumBendalloy extends BandMindAbstract {

    /**
     * Default constructor, it is important to send the metals by parameter in the correct order, metal and its alloy.
     *
     * @param properties of the item.
     */
    public BandCadmiumBendalloy (Item.Properties properties){
        super(properties, MetalTagEnum.CADMIUM, MetalTagEnum.BENDALLOY, new CadmiumFecuchemicHelper(), new BendalloyFecuchemicHelper());
    }

}