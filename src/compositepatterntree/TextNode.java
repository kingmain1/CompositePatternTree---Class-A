/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author jeppjleemoritzled
 */
public class TextNode
{
    
    private String str;
    private GraphicsContext context;
    private int x,y;
    private List<TextNode> children = new ArrayList();

    public void addChild(TextNode node)
    {
        children.add(node);
    }
    
    public void removeChild(TextNode node)
    {
        children.remove(node);
    }
    
    public List<TextNode> getChildren()
    {
        return children;
    }
    
    public TextNode(String str, GraphicsContext context, int x, int y)
    {
        this.str = str;
        this.context = context;
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Get the value of context
     *
     * @return the value of context
     */
    public GraphicsContext getContext()
    {
        return context;
    }

    /**
     * Set the value of context
     *
     * @param context new value of context
     */
    public void setContext(GraphicsContext context)
    {
        this.context = context;
    }

    
    

    /**
     * Get the value of str
     *
     * @return the value of str
     */
    public String getStr()
    {
        return str;
    }

    /**
     * Set the value of str
     *
     * @param str new value of str
     */
    public void setStr(String str)
    {
        this.str = str;
    }

    public void drawNode()
    {
        context.fillText(str, x, y);
        for (TextNode textNode : children)
        {
            textNode.drawNode();
        }
    }

}
