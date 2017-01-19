package net.Soul4SkySan;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * MIT License
 * <p>
 * Copyright (c) 2017 Soul4SkySan
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class FK extends JavaPlugin {

    private ConsoleCommandSender console;

    @Override
    public void onLoad() {
        super.onLoad();
        console = Bukkit.getConsoleSender();
        console.sendMessage("§eFK en cour de chargement . . . ");
    }

    @Override
    public void onEnable() {
        super.onEnable();
        console = Bukkit.getConsoleSender();
        console.sendMessage("§aFK active !");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        console = Bukkit.getConsoleSender();
        console.sendMessage("§cFk desactive");
    }
}