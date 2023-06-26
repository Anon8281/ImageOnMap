/*
 * Copyright or © or Copr. QuartzLib contributors (2015 - 2020)
 *
 * This software is governed by the CeCILL-B license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL-B
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-B license and that you accept its terms.
 */

package fr.zcraft.quartzlib.tools.runners;

import com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler;
import fr.moribus.imageonmap.ImageOnMap;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;


/**
 * This utility class shortens the code used to execute tasks.
 */
public final class RunTask {
    private static final TaskScheduler scheduler = ImageOnMap.getScheduler();

    private RunTask() {
    }

    /**
     * Returns a task that will run on the next server tick.
     *
     * @param runnable The task to be run.
     */
    public static void nextTick(Runnable runnable) {
        scheduler.runTask(runnable);
    }

    /**
     * Returns a task that will run after the specified number of server ticks.
     *
     * @param runnable The task to be run.
     * @param delay    The ticks to wait before running the task.
     */
    public static void later(Runnable runnable, long delay) {
        scheduler.runTaskLater(runnable, delay);
    }
}
